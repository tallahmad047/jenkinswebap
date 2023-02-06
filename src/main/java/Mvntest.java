import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mvntest {
    public static void main(String[] args) {
        //définit le chemin vers le fichier exécutable du pilote Chrome.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\selenium\\chromedriver.exe");

        // instancie un nouveau pilote Chrome, qui sera utilisé pour ouvrir et contrôler un navigateur web.
        WebDriver webDriver=new ChromeDriver();

        //maximise la fenêtre du navigateur pour afficher la totalité de la page.
        webDriver.manage().window().maximize();

        //navigue vers la page d'accueil de Facebook.
        webDriver.get("http://facebook.com");

        //affiche le titre de la page actuelle dans la console.
        System.out.println(webDriver.getTitle());

        // trouve l'élément correspondant au sélecteur CSS "#email" et envoie les caractères "binta@9619@gmail.com"
        // à ce champ.
        webDriver.findElement(By.cssSelector("#email")).sendKeys("binta9619@gmail.com");

        // trouve l'élément correspondant au sélecteur CSS "#pass" et envoie les caractères "Salamoun1" à ce champ.
        //
        webDriver.findElement(By.cssSelector("#pass")).sendKeys("Salamoun1.");
        //correspondant au nom "login" et clique dessus pour soumettre le formulaire de connexion
        webDriver.findElement(By.name("login")).click();
    }
}
