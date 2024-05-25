package Account;
import java.io.*;
import java.util.*; 
public class Account {
    private String name;
    private String password;
    public Account(){}
    public Account(String name,String password){
        this.name = name;
        this.password = password;
    }

    public void setName(String name){this.name = name;}
    public void setPassword(String password){this.password=password;}

    public String getName(){return this.name;}
    public String getPassword(){return this.password;}

    public void addAccount(){
    try{
        File file = new File("data.txt");
        file.createNewFile();
        FileWriter filewriter = new FileWriter(file,true);
        filewriter.write(getName() + "\t");
        filewriter.write(getPassword()+ "\t");
        filewriter.write("\n");
        filewriter.flush();
        filewriter.close();
    }
    catch(IOException ioe){
        ioe.printStackTrace();
    }
}

    public boolean CheckAccount(String name, String password)
	{
		boolean flag = false;
		File file = new File("data.txt");
		try 
		{
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine())
			{
				String line = sc.nextLine();
				String[] value = line.split("\t");
				if(value[0].equals(name) && value[1].equals(password))
				{
					flag = true;
				}
			}
		}
		catch(IOException io) 
		{
			io.printStackTrace();
		}
		return flag;
	}
    }



