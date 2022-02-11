public class Terminal {
  private String id;
  private int tiempo;

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public int getTiempo() {
    return tiempo;
  }
  public void setTiempo(int tiempo) {
    this.tiempo = tiempo;
  }
  public Terminal(String id) {
    this.id = id;
  }
  public void llama(Terminal t , int time){
    System.out.println("Nº "+t.getId()+ " - "+(getTiempo()+time)+"s de conversación.");
    Terminal.tiempo += time;
  }
}
