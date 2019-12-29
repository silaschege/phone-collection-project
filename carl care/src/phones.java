public class phones {
    private int ID_phone;
    private String Phone_name;
    private int Imei;
    private String Customer_name;
    private String Date_of_invoice;
    private String Issue;
    private byte[] Image;
    
    public phones(int newID_phone,String newPhone_name,int newImei, String newCustomer_name ,String newDate_of_invoice, String newIssue, byte [] newImage){
    
        this.ID_phone=newID_phone;
        this.Phone_name=newPhone_name;
        this.Imei=newImei;
        this.Customer_name=newCustomer_name;
        this.Date_of_invoice=newDate_of_invoice;
        this.Issue=newIssue;
        this.Image=newImage;
    }
    
    public int getID_phone()
    {
    return ID_phone;
     }
    
    public String getPhone_name()
    {
        return Phone_name;
    }
    
    public int getImei()
    {
        return Imei;
    }
    
    public String getCustomer_name()
    {
        return Customer_name;
    }
    
    public String getDate_of_invoice()
    {
        return Date_of_invoice;
    }
    
    public String getIssue()
    {
        return Issue;
    }
    
    public byte [] getImage ()
    {
        return Image;
    }
}
