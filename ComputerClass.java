package EjercicioOrdenador;/*
Hecho dia jue. 03/12/2020
Creado por: Juanma
Paquete: EjercicioOrdenador
Descripcion:
*/

import java.util.*;
public class ComputerClass {
    private String name;
    private int ramMemory;
    private int hardDisk;
    private OperatingSystem operatingSystem;

    public ComputerClass(){
    }

    public ComputerClass(String name, int ramMemory, int hardDisk){
        this.name = name;
        this.ramMemory = ramMemory;
        this.hardDisk = hardDisk;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRamMemory(int ramMemory){
        this.ramMemory = ramMemory;
    }

    public void setHardDisk(int hardDisk){
        this.hardDisk = hardDisk;
    }

    public void operatingSystemInstalled(OperatingSystem operatingSystem){
        if (operatingSystem != null){
            this.hardDisk -= operatingSystem.getOsSpaceRequirement();
            this.ramMemory -= operatingSystem.getOsRamMemoryRequirement();
            this.operatingSystem = operatingSystem;
        }
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public String getName(){
        return this.name;
    }

    public int getRamMemory(){
        return this.ramMemory;
    }

    public int getHardDisk(){
        return this.hardDisk;
    }

    public void computerFormat(){
        this.operatingSystem = operatingSystem;
        this.hardDisk += operatingSystem.getOsSpaceRequirement();
        this.ramMemory += operatingSystem.getOsRamMemoryRequirement();
    }
}
