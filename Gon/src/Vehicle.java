
import java.util.ArrayList;
import java.util.Scanner;

public  class Vehicle{
        private  String OwnerName;
        private String VehicleNumber;
        private String Model;
        private double Value;
        private int Capactivy;
    public  Vehicle(String OwnerName, String VehicleNumber, String Model, double Value, int Capactivy){
        this.OwnerName=OwnerName;
        this.VehicleNumber=VehicleNumber;
        this.Model=Model;
        this.Value=Value;
        this.Capactivy=Capactivy;
    }
    public  String getOwnerName(){
        return  OwnerName;
    }
    public  void setOwnerName(String OwnerName){
        this.VehicleNumber=VehicleNumber;
    }
    public String getVehicleNumber(){
        return VehicleNumber;
    }
    public void  setVehicleNumber(String VehicleNumber){
        this.VehicleNumber=VehicleNumber;
    }
    public  String getModel(){
        return Model;
    }
    public void setModel(String Model){
        this.Model=Model;
    }
    public double getValue(){
        return  Value;
    }
    public void  setValue(double Value){
        this.Value=Value;
    }
    public  int getCapactivy(){
        return Capactivy;
    }
    public void setCapactivy(int Capactivy){
        this.Capactivy=Capactivy;
    }
    public double TaxCar(){
        if(Capactivy<100)  {
            return Value*0.01;
        }
        else if (Capactivy<=200)
        {
            return Value*0.03;
        }else
        {
            return Value*0.05;
        }
    }
    public class ManageCar{
        public static  void main(String[] args){
            ArrayList<Vehicle> CarList= new ArrayList<>();
            Scanner scanner= new Scanner(System.in);
            //int choice;
            System.out.println("chuongw trình quản lý phương tiện");
            while(true) {
                System.out.println("1. Nhập thông tin và tạo bảng thông tin xe ");
                System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe.");
                System.out.println("3. Thoát");
                System.out.print(" Hãy chọn  phần bạn muốn nhập:  ");
               // int choice = scanner.nextInt();

            }

        }
    }
}
