
public class TouchScreenDevice {
	private String model; 
	private String brand; 
	private String typeOfDevice; 
	private String nameOS; 
	private String cpu; 
	private String size; 
	private String ram; 
	private String memoryFunctions; 
	private String signal; 
	private String camera; 
	
	public void setModel(String newModel){ 
		model = newModel;
	}
	public String getModel(){ 
		return model;
    }
	public void setBrand(String newBrand){ 
		brand = newBrand;
	}
	public String getBrand(){ 
		return brand;
    }
	public void setTypeOfDevice(String newTypeOfDevice){ 
		typeOfDevice = newTypeOfDevice;
	}
	public String getTypeOfDevice(){ 
		return typeOfDevice;
    }
	public void setNameOS(String newNameOS){ 
		nameOS = newNameOS;
	}
	public String getNameOS(){ 
		return nameOS;
    }
	public void setCpu(String newCpu){ 
		cpu = newCpu;
	}
	public String getCpu(){ 
		return cpu;
    }
	public void setSize(String newSize){ 
		size = newSize;
	}
	public String getSize(){ 
		return size;
    }
	public void setRam(String newRam){ 
		ram = newRam;
	}
	public String getRam(){ 
		return ram;
    }
	public void setMemoryFunctions(String newMemoryFunctios){ 
		memoryFunctions = getMemoryFunctions();
	}
	public String getMemoryFunctions(){ 
		return memoryFunctions;
    }
	public void setSignal(String newSignal){ 
		signal = newSignal;
	}
	public String getSignal(){ 
		return signal;
    }
	public void setCamera(String newCamera){ 
		camera = newCamera;
	}
	public String getCamera(){ 
		return camera;
    }
}