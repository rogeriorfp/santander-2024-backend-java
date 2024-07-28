package iphone;

public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public static void main(String[] args) throws Exception {
        iPhone iphone = new iPhone();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("No name");
        iphone.exibirPagina("web.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.ligar("55000123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música a partir de " + this.getClass().getSimpleName());
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionado música: " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
     }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }


}
