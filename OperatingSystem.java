package EjercicioOrdenador;/*
Hecho dia vie. 04/12/2020
Creado por: Juanma
Paquete: EjercicioOrdenador
Descripcion:
*/

import java.util.ArrayList;
public class OperatingSystem {
    private String osName;
    private String osVersion;
    private String osArchitecture;
    private boolean osOnlyCommand;
    private int osSpaceRequirement;
    private int osRamMemoryRequirement;
    private ArrayList<Software> osSoftware = new ArrayList<Software>();

    public OperatingSystem(){
    }

    public OperatingSystem(String osName, String osVersion, String osArchitecture, boolean osOnlyCommand, int osSpaceRequirement, int osRamMemoryRequirement){
        this.osName = osName;
        this.osVersion = osVersion;
        this.osArchitecture = osArchitecture;
        this.osOnlyCommand = osOnlyCommand;
        this.osSpaceRequirement = osSpaceRequirement;
        this.osRamMemoryRequirement = osRamMemoryRequirement;
    }

    public void setOsName(String osName){
        this.osName = osName;
    }

    public void setOsVersion(String osVersion){
        this.osVersion = osVersion;
    }

    public void setOsArchitecture(String osArchitecture){
        this.osArchitecture = osArchitecture;
    }

    public void setOsOnlyCommand(boolean osOnlyCommand){
        this.osOnlyCommand = osOnlyCommand;
    }

    public void setOsSpaceRequirement(int osSpaceRequirement){
        this.osSpaceRequirement = osSpaceRequirement;
    }

    public void setOsRamMemoryRequirement(int osRamMemoryRequirement){
        this.osRamMemoryRequirement = osRamMemoryRequirement;
    }

    public ArrayList<Software> getOsSoftware(){
        return osSoftware;
    }

    public void installSoftware(Software software, ComputerClass computer){
        computer.setHardDisk(computer.getHardDisk() - software.getSoftwareSpaceRequirement());
        computer.setRamMemory(computer.getRamMemory() - software.getSoftwareRamMemoryRequirement());
        this.osSoftware.add(software);
    }
    public void uninstallSoftware(Software osSoftware, ComputerClass computer){
        computer.setHardDisk(computer.getHardDisk() + osSoftware.getSoftwareSpaceRequirement());
        computer.setRamMemory(computer.getRamMemory() + osSoftware.getSoftwareRamMemoryRequirement());
        this.osSoftware.remove(osSoftware);
    }

    public String getOsName(){
        return this.osName;
    }

    public String getOsVersion(){
        return this.osVersion;
    }

    public String getOsArchitecture(){
        return this.osArchitecture;
    }

    public boolean getOsOnlyCommand(){
        return this.osOnlyCommand;
    }

    public int getOsSpaceRequirement(){
        return this.osSpaceRequirement;
    }

    public int getOsRamMemoryRequirement(){
        return this.osRamMemoryRequirement;
    }
}
