public class Client extends Observer{

    protected String news;

    protected int zone;

    public Client(int zone){
        this.news = "";
        this.zone = zone;
    }

    /*
     * Updates the variable "news"
     */
    public void update(Object o){

        // not sure

        System.out.println(o);
        Pair nouveaux = (Pair) o;
        String message = (String) nouveaux.getAlert();
        news = message;
    }

    /*
     * Getter for zone
     */
    public int getZone(){
        return zone;
    }

    /*
     * Getter for news
     */
    public String getNews(){
        return news;
    }





}
