class Vehicle {
    private String ownerName;
    private String vehicleType;
    private double vehicleValue;
    private int engineCapacity; // in cc

    public Vehicle(String ownerName,String vehicleType, double vehicleValue, int engineCapacity) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.vehicleValue = vehicleValue;
        this.engineCapacity = engineCapacity;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public double getVehicleValue() {
        return vehicleValue;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public double calculateTax() {
        if (engineCapacity < 100) {
            return vehicleValue * 0.01;
        } else if (engineCapacity <= 200) {
            return vehicleValue * 0.03;
        } else {
            return vehicleValue * 0.05;
        }
    }

    // Phương thức in bảng kê khai thuế
    public void printTaxDeclaration() {
        System.out.printf("Tên chủ xe: %s, Trị giá xe: %.2f VND, Tiền thuế: %.2f VND\n",
                ownerName, vehicleValue, calculateTax());
    }
}

