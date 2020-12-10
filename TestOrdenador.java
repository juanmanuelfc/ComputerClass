package EjercicioOrdenador;/*
Hecho dia vie. 04/12/2020
Creado por: Juanma
Paquete: EjercicioOrdenador
Descripcion:
*/

public class TestOrdenador {
    public static void main(String[] args) {
        //Creamos el pc
        ComputerClass computer1 = new ComputerClass("c1", 4, 100);
        //Creamos el sistema operativo
        OperatingSystem operatingSystem1 = new OperatingSystem("os1", "1.0", "64", true, 20, 2);
        //Creamos el primer programa
        Software software1 = new Software("s1", "1.0", 2, 1);
        //Creamos el segundo programa
        Software software2 = new Software("s2", "2.0", 1, 6);
        //Pedimos que nos de el espacio en disco que tenemos disponible
        System.out.println(computer1.getHardDisk());
        //Instalamos el sistema operativo
        computer1.operatingSystemInstalled(operatingSystem1);
        //Pedimos que nos de el espacio en disco que tenemos disponible
        System.out.println(computer1.getHardDisk());
        //Instalamos el primer programa en el sistema operativo
        computer1.getOperatingSystem().installSoftware(software1);

        //Actualizamos la memoria ram y de disco
        computer1.setHardDisk(computer1.getHardDisk() - software1.getSoftwareSpaceRequirement());
        computer1.setRamMemory(computer1.getRamMemory() - software1.getSoftwareRamMemoryRequirement());

        //Pedimos que nos de el espacio en disco que tenemos disponible
        System.out.println(computer1.getHardDisk());

        //Instalamos el segundo programa en el sistema operativo
        computer1.getOperatingSystem().installSoftware(software2);

        //Actualizamos la memoria ram y de disco
        computer1.setHardDisk(computer1.getHardDisk() - software2.getSoftwareSpaceRequirement());
        computer1.setRamMemory(computer1.getRamMemory() - software2.getSoftwareRamMemoryRequirement());

        //Pedimos que nos de el espacio en disco que tenemos disponible
        System.out.println(computer1.getHardDisk());

        //Desinstalamos el segundo programa del sistema operativo
        computer1.getOperatingSystem().uninstallSoftware(software2);

        //Actualizamos la memoria ram y de disco
        computer1.setHardDisk(computer1.getHardDisk() + software2.getSoftwareSpaceRequirement());
        computer1.setRamMemory(computer1.getRamMemory() + software2.getSoftwareRamMemoryRequirement());

        //Pedimos que nos de el espacio en disco que tenemos disponible
        System.out.println(computer1.getHardDisk());

        //Formateamos el pc
        computer1.computerFormat();
        computer1.getOperatingSystem().uninstallSoftware(software1);
        computer1.setHardDisk(computer1.getHardDisk() + software1.getSoftwareSpaceRequirement());
        computer1.setRamMemory(computer1.getRamMemory() + software1.getSoftwareRamMemoryRequirement());

        //Pedimos que nos de el espacio en disco que tenemos disponible
        System.out.println(computer1.getHardDisk());
    }
}
