package ADD_PROPERTY;
//import javax.swing.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//import Account.*;
//import HOME_PAGE.*;
//import LOGINPAGE.*;
//import NEWACCOUNTHOMEPAGE.*;

//import java.awt.*;
//import java.awt.event.*;
//import images.*;

public class sellf {

    private String code;
    private String area;
    private String details;
    private String price;
    private String agentname;
    private String email;
    private String contact;
    sellf(){}

    public sellf(String code,String area,String details,String price,String agentname,String email,String contact){
        this.code = code;
        this.area = area;
        this.details = details;
        this.price = price;
        this.agentname = agentname;
        this.email = email;
        this.contact = contact;
    }

    public void setCode(String code){this.code=code;}
    public void setArea(String area){this.area=area;}
    public void setDetails(String details){this.details=details;}
    public void setPrice(String price){this.price=price;}
    public void setAgentname(String agentname){this.agentname=agentname;}
    public void setEmail(String email){this.email=email;}
    public void setContact(String contact){this.contact=contact;}
    

    public String getCode(){return this.code;}
    public String getArea(){return this.area;}
    public String getDetails(){return this.details;}
    public String getPrice(){return this.price;}
    public String getAgentname(){return this.agentname;}
    public String getEmail(){return this.email;}
    public String getContact(){return this.contact;}


    public void sellProperty(String code,String area,String details,String price,String agentname,String email,String contact){
    try{
        File file = new File("PropertySellFile.txt");
        file.createNewFile();
        FileWriter fw = new FileWriter(file,true);
        fw.write("Property Code : "+getCode()+"\n");
        fw.write("Area : "+getArea()+"\n");
        fw.write("Details : "+getDetails()+"\n");
        fw.write("Price : "+getPrice()+"\n");
        fw.write("Agent Name : "+getAgentname()+"\n");
        fw.write("Email : "+getEmail()+"\n");
        fw.write("Contact : "+getContact()+"\n");
        fw.write("-----------------------------------------------------------------");
        fw.write("\n");
        fw.flush();
        fw.close();
    }

    catch(IOException i){
        i.printStackTrace();
    }
}
public static void main(String[] z){
   // System.out.println(" "+getCode());
}

    
}

