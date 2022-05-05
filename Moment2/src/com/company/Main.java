package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        Scanner inputDataInt = new Scanner(System.in);
        List<Watchman> watchmans = new ArrayList<>();
        List<CleaningStaff> cleanningStaffs = new ArrayList<>();
        List<Accountant> accountants = new ArrayList<>();
        List<Admin> admins = new ArrayList<>();

        String seguir = "Si";
        int num;
        while (seguir.equals("Si") || seguir.equals("si") || seguir.equals("SI")){
            System.out.println("Que perfil desea diligenciar \n"+
                                "1. Watchman\n"+
                                "2.CleanningStaff\n"+
                                "3.Accountant\n"+
                                "4. Admin");
            num = inputDataInt.nextInt();
            switch (num){
                case 1:
                    Watchman watchman = new Watchman();
                    System.out.println("Digite el nombre: ");
                    watchman.setName(inputData.nextLine());
                    System.out.println("Digite la identificación: ");
                    watchman.setIdentification(inputData.nextLine());
                    System.out.println("Digite la edad: ");
                    watchman.setAge(inputData.nextInt());
                    System.out.println("Digite el arma: ");
                    watchman.setWeapon(inputData.nextLine());
                    System.out.println("Digite el día de descanso: ");
                    watchman.setRestDay(inputData.nextLine());
                    watchmans.add(watchman);
                    break;
                case 2:
                    CleaningStaff cleaningStaff = new CleaningStaff();
                    System.out.println("Digite el nombre: ");
                    cleaningStaff.setName(inputData.nextLine());
                    System.out.println("Digite la identificación: ");
                    cleaningStaff.setIdentification(inputData.nextLine());
                    System.out.println("Digite la edad: ");
                    cleaningStaff.setAge(inputData.nextInt());
                    System.out.println("Digite el día de descanso: ");
                    cleaningStaff.setDayOff(inputData.nextLine());
                    cleanningStaffs.add(cleaningStaff);
                    break;
                case 3:
                    Accountant accountant = new Accountant();
                    System.out.println("Digite el nombre: ");
                    accountant.setName(inputData.nextLine());
                    System.out.println("Digite la identificación: ");
                    accountant.setIdentification(inputData.nextLine());
                    System.out.println("Digite la edad: ");
                    accountant.setAge(inputData.nextInt());
                    System.out.println("Digite el nombre del lider: ");
                    accountant.setLeader(inputData.nextLine());
                    System.out.println("Digite el parqueadero: ");
                    accountant.setParking(inputData.nextLine());
                    accountants.add(accountant);
                    break;
                case 4:
                    Admin admin = new Admin();
                    System.out.println("Digite el nombre: ");
                    admin.setName(inputData.nextLine());
                    System.out.println("Digite la identificación: ");
                    admin.setIdentification(inputData.nextLine());
                    System.out.println("Digite la edad: ");
                    admin.setAge(inputData.nextInt());
                    System.out.println("Digite el nombre del lider: ");
                    admin.setLeader(inputData.nextLine());
                    System.out.println("Digite el parqueadero: ");
                    admin.setParking(inputData.nextLine());
                    admins.add(admin);
                    break;
            }
            System.out.println("Desea ingresar información a otro perfil (Si/No): ");
            seguir = inputData.nextLine();
        }

        System.out.println("Que perfil desea consultar: \n"+
                "1. Watchman\n"+
                "2.CleanningStaff\n"+
                "3.Accountant\n"+
                "4. Admin");
        num = inputDataInt.nextInt();
        switch (num){
                    case 1:
                    for (int a = 0; a < watchmans.size();a++) {
                            System.out.println("La información correspondiente a Watcman es: \n"+
                            watchmans.get(a).mostrarWatcman()+"\n");
                            }
                    break;
                    case 2:
                        for (int b = 0; b < cleanningStaffs.size();b++) {
                            System.out.println("La información correspondiente a CleaninsStaff es: \n"+
                            cleanningStaffs.get(b).mostrarCleaning()+"\n");
                        }
                        break;
                    case 3:
                        for (int c = 0; c < accountants.size();c++) {
                            System.out.println("La información correspondiente a Accountant es: \n"+
                            accountants.get(c).mostrarAccountant()+"\n");
                        }
                        break;
                    case 4:
                        for (int d = 0; d < admins.size();d++) {
                             System.out.println("La información correspondiente a Admin es: \n"+
                             admins.get(d).mostrarAdmin()+"\n");
                        }
                        break;
        }

    }

}
