import com.jakewharton.fliptables.FlipTableConverters;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Livrari {
    Livrare liv;
    public Livrare getLiv() {
        return liv;
    }

    public void setLivrari() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/fzcmp";
        Properties props = new Properties();
        props.setProperty("user","postgres");
        props.setProperty("password","admin");
        //props.setProperty("ssl","false");
        List<Furnizor> fzs = new ArrayList<Furnizor>();
        List<Componenta> cmps = new ArrayList<Componenta>();
        List<Integer> cants = new ArrayList<Integer>();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = null;
        Statement st=null;
        try {
            conn = DriverManager.getConnection(url, props);
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String SQL = """
        select idc, numec, culoare, um, idf, numef, stare, oras, cant from componente c, furnizori f, fapte l
        where c.id=l.idc and f.id=l.idf;""";
        ResultSet rs = st.executeQuery(SQL);
        System.out.println(FlipTableConverters.fromResultSet(rs));
        while (true) {
            try {
                if (!rs.next()) break;
                Componenta cmp = new Componenta();
                cmp.setDenumire(rs.getString(2));cmp.setCuloare(rs.getString(3));cmp.setUm(rs.getString(3));
                cmps.add(cmp);
                Furnizor fz = new Furnizor();
                fz.setNume(rs.getString(6));fz.setStare(rs.getInt(7));fz.setOras(rs.getString(8));
                fzs.add(fz);
                cants.add(rs.getInt(9));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        this.liv = new Livrare(fzs, cmps, cants);
    }
}
