package Lesson5;

public class HW5Sizykhv2 {

    public static void main(String[] args) {

        sotrudnik mainEmployes =new sotrudnik ("Pol","Vadimovich","Sizykh",
                "qa","Pol@ms.ru","89998887766",100,1993 );



        sotrudnik[] office = {
                mainEmployes,
                new sotrudnik("Denis","Denisovich","Denisov","Desinger",
                        "ddd@ms.ru","27227628",800,1960),

                new sotrudnik("Petr","Petrovich","Petrov","Manager",
                        "ppp@ms.ru","27327628",700,1970),

                new sotrudnik("Alex","Alexandrovich","Alexandrov","Sales manager",
                        "aaa@ms.ru","21127628",500,1980),

                new sotrudnik("Anton","Antonvich","Antonov","PM",
                        "aaantonov@ms.ru","27227028",1000,1990)

        };
        getAllSotrudniki(office);
        System.out.println("           ");
        getOldPerson(office,40);


    }

    private static void getOldPerson(sotrudnik[] office, int year) {
        for (int i = 0; i < office.length; i++)
            if (office[i].getAge()>year){
                System.out.println(office[i].getAll());

            }
    }


    private static void getAllSotrudniki(sotrudnik[] office) {
        System.out.println("All");
        for (int i = 0; i < office.length ; i++)
        {
            System.out.println((i+1)+" "+office[i].getAll());

        }
    }

}


