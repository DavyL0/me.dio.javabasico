import com.apps.NavNet;
import com.apps.ReprodutorMusica;
import com.apps.Telefone;

public class IphoneJobs {
public static void main(String[] args) {
    Telefone telefone = new Telefone();
    ReprodutorMusica ipod = new ReprodutorMusica();
    NavNet safari = new NavNet();

    telefone.ligar();
    telefone.atender(6969696);
    ipod.selecionarMusica("Master of Puppets");
    safari.escolherPagina("Youtube");
    safari.adicionarNovaAba();
}
}
