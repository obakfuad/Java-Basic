public class c{
  public static void main(String [] args){

    ContactsManager myContactsManager = new ContactsManager();

    Contact friendJames = new Contact();

    friendJames.name = "James";
    friendJames.phoneNumber = "0012223333";

    myContactsManager.addContact(friendJames);

    Contact friendCezanne = new Contact();

    friendCezanne.name = "Cezanne";
    friendCezanne.phoneNumber = "987654321";

    myContactsManager.addContact(friendCezanne);

    Contact friendJessica = new Contact();

    friendJessica.name = "Jessica";
    friendJessica.phoneNumber = "5554440001";

    myContactsManager.addContact(friendJessica);
    

    Contact result = myContactsManager.searchContact("James");
    System.out.println(result.phoneNumber);
  }
}