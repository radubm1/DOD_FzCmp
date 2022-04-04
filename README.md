# DOD_FzCmp

Aplicatie de tip ORM care realizeaza in mod dinamic un model obiectual orientat pe date placand de la schema Furnizori de componente (PostgreSQL, vezi backup).
Rezultatul este o agregare (model de tip flat, suboptimal sub aspect relational) pe toate componentele bazei de date tranzactionale care insa poate fi prelucrata in paralel (pe mai multe fire de executie si nuclee de procesor) mult mai eficient decat in mod normal.
In concluzie a fost preferata paradigma StructureOverArray (SoA) celei de tip ArrayOverStructure (AoS).
