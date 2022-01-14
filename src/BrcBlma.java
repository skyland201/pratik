import java.util.Scanner;

public class BrcBlma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String burc="";

        System.out.println("Doğduğunuz ayı giriniz: ");int ay=input.nextInt();

        System.out.println("Doğduğunuz günü giriniz: ");int gün=input.nextInt();
        if(ay==1){
            if(gün>=1&&gün<=31){
                if(gün<=21)
                    burc="Oğlak";
                else
                    burc="Kova";
            }else{
                System.out.println("Girişiniz Hatalı!");
            }
        }
        else if(ay==2){
            if(gün>=1&&gün<=28){
                if(gün<=19)
                    burc="Kova";
                else
                    burc="Balık";
            }else{
                System.out.println("Girişiniz Hatalı!");
            }

        }
        else if(ay==3){
            if(gün>=1&&gün<=31){
                if(gün<=20)
                    burc="Balık";
                else
                    burc="Koç";
            }else{
                System.out.println("Girişiniz Hatalı!");
            }
        }
        else if(ay==4){
            if(gün>=1&&gün<=30){
                if(gün<=20)
                    burc="Koç";
                else
                    burc="Boğa";
            }else{
                System.out.println("Girişiniz hatalı.");
            }
        }
        else if(ay==5){
            if(gün>=1&&gün<=31){
                if(gün<=21)
                    burc="Boğa";
                else
                    burc="İkizler";
            }else{
                System.out.println("Girişiniz hatalı.");
            }

        }
        else if(ay==6){
            if(gün>=1&&gün<=30){
                if(gün<=22)
                    burc="İkizler";
                else
                    burc="Yengeç";
            }else{
                System.out.println("Girişiniz hatalı.");
            }

        }
        else if(ay==7){
            if(gün>=1&&gün<=31){
                if(gün<=22)
                    burc="Yengeç";
                else
                    burc="Aslan";
            }else{
                System.out.println("Girişiniz hatalı.");
            }

        }
        else if(ay==8){
            if(gün>=1&&gün<=31){
                if(gün<=22)
                    burc="Aslan";
                else
                    burc="Başak";
            }else{
                System.out.println("Girişiniz hatalı.");
            }

        }
        else if(ay==9){
            if(gün>=1&&gün<=30){
                if(gün<=22)
                    burc="Başak";
                else
                    burc="Terazi";
            }else{
                System.out.println("Girişiniz hatalı.");
            }

        }
        else if(ay==10){
            if(gün>=1&&gün<=31){
                if(gün<=22)
                    burc="Terazi";
                else
                    burc="Akrep";
            }else{
                System.out.println("Girişiniz hatalı.");
            }

        }
        else if(ay==11){
            if(gün>=1&&gün<=30){
                if(gün<=21)
                    burc="Akrep";
                else
                    burc="Yay";
            }else{
                System.out.println("Girişiniz hatalı.");
            }
        }
        else if(ay==12){
            if(gün>=1&&gün<=31){
                if(gün<=21)
                    burc="Yay";
                else
                    burc="Oğlak";
            }else{
                System.out.println("Girişiniz hatalı.");
            }

        }else{
            System.out.println("hatalı giriş yaptınız! Tekrar deneyiniz.");
        }

        System.out.println("Burcunuz: "+burc);



    }
}
