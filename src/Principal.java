import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codAcceso = 2012;
        int nivelPermiso1 = 1;
        int nivelPermiso3 = 3;

        System.out.println("------------------------------------");
        System.out.println("--- Bienvenido a Empresas ACME ---");
        System.out.println("------------------------------------");
        System.out.println("Ingrese su codigo de acceso: ");
        int readAccessCode = scanner.nextInt();
        System.out.println("Ingrese su nivel de acceso: ");
        int readLevelAccess = scanner.nextInt();

        boolean validCode = readAccessCode == codAcceso;
        boolean validLevel = readLevelAccess >= nivelPermiso1 && readLevelAccess <= nivelPermiso3;

        securityValidation(validCode,validLevel);
    }
    public static void  securityValidation(boolean validCode, boolean validLevel) {
        if (validCode && validLevel) {
            System.out.println("Acceso permitido.");
        }
        else{
            System.out.println("Acceso No permitido.");
        }
            if(!validCode){
                System.out.println("El codigo de acceso ingresado no es vallido.");
        }
            if(!validLevel){
                System.out.println("El nivel de acceso ingresado no es valido.");
        }
    }
}
