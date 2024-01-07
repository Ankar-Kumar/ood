public abstract class WebPageDecorator implements WebPage {
    protected WebPage  page;
    public WebPageDecorator(WebPage webpage){
        this.page=webpage;
    }
    // override
    public void display(){
        this.page.display();
    }
}
