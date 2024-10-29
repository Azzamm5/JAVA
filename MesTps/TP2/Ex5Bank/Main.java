package MesTps.TP2.Ex5Bank;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Riyad","Maj","AL111","riyadmaj10@gmail.com","0652535301","M");
        Client client2 = new Client("Mohamed","AZZAM","jsgxex","mohamed@gmail","827187893","M");

        Banque Cih = new Banque("CIH","Rabat","0606060606");

        Cih.getClients().add(client1);
        Cih.getClients().add(client2);


        Compte c1 = new Compte(client1,7000.90);

        BanqueAdminService b1 = new BanqueAdminService(Cih);
        b1.creercompte();



        b1.listercompte();




    }
}
