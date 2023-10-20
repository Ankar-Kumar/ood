public class AuthorizedWebPage extends WebPageDecorator {
    public AuthorizedWebPage(WebPage decoratedPage){
        super(decoratedPage);
    }
    public void AuthorizedUser(){
        System.out.println("Authorized user");

    }

    public void display(){
        super.display();
        this.AuthorizedUser();
    }
    
    
}
