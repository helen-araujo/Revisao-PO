package desafio02.po;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;




 
 
public class Desafio02PO {
    
  //String dirname = "../text/";
  Scanner input = new Scanner(System.in);
  Scanner ler = new Scanner(System.in);
 
  int matriz[][];
  int[] vetor;
  int size;
 public void AbrirAquivo(){
        try{
            input= new Scanner(new File ("Desafio02.txt"));
        }
        catch(FileNotFoundException fileNotFoundException){
            System.err.println("Erro ao abrir arquivo");
            System.exit(1);
        
        }
    }
  
  public void LerArquivo(){
    size = ler.nextInt();
    matriz = new int[size][size];
    while(ler.hasNextInt()){
      for(int i=0; i<size; i++){
        for(int j=0; j<size; j++){ 
              matriz[i][j]=ler.nextInt();
        }
      }          
    }
  }
  public void Kcidade(){
    int k;
    System.out.println("Informe a cidade K: ");
    k = input.nextInt();
    int entrada=0;
    int saida =0;
    for(int i=0; i<size; i++){
      if(matriz[k][i] == 1 &&  i!=k){
        saida++;
      }
      if(matriz[i][k] == 1 && i!=k){
        entrada++;
      }
    } 
    System.out.println("São "+ saida +" saidas da cidade "+ k);
    System.out.println("São "+ entrada +" entradas da cidade "+ k);
    System.out.println();
  }
  public void maiorNcidades(){
    int estrada;
    int aux=0;
    int cont=0;
    for(int i=0; i<size; i++){
      estrada = 0;
      for(int j=0; j<size; j++){
        if(matriz[i][j] == 1 && i!=j){
          estrada++;
        }
        if(matriz[j][i] == 1 && i!=j){
          estrada++;
        }
        if(aux<estrada){
          aux = estrada;
          cont=i;
        }
      }
    } 
    System.out.println("A cidade com mais estradas e: "+cont+" com  " +aux+" estradas");
    System.out.println();
  }
  public void maodupla(){
    for(int i=0; i<size; i++){
      for(int j=0; j<size; j++){
        if(matriz[i][j] == 1 && matriz[j][i]== 1 && i!=j){
          System.out.println("A cidade: "+i+" tem mao dubla com " +j);
        }
      }
    }
    System.out.println(); 
  }

  public void saidaK(){
    int k;
    System.out.print("Insira a cidade K para ver as cidades que possui saidas diretas: ");
    k = ler.nextInt();
    for(int i=0; i<size; i++){
      if(matriz[i][k] == 1 && i!=k ){
        System.out.println(i+" possui");
      }else{
        System.out.println(i+" nao possui");
      }
    }
    System.out.println();
  }
  public void isolada(){
    boolean cidade=true;
    for(int i=0; i<size; i++){
      cidade=true;
      for(int j=0; j<size; j++){
        if((matriz[i][j] == 1 || matriz[j][i]== 1) && i!=j){
          cidade = false;
        }
      }
      if(cidade){
        System.out.println("A cidade: "+i+" e isolada");
      }else{
        System.out.println("A cidade: "+i+" NAO e isolada");
      }
    }
    System.out.println();
  }
  public void naoSaida(){
    boolean cidade=true;
    for(int i=0; i<size; i++){
      cidade=true;
      for(int j=0; j<size; j++){
        if(matriz[i][j] == 1 && i!=j){
          cidade = false;
        }
      }
      if(cidade){
        System.out.println("A cidade: "+i+" NAO tem saida");
      }else{
        System.out.println("A cidade: "+i+" tem saida");
      }
    }
    System.out.println();
  }
  public void naoEntrada(){
    boolean cidade=true;
    for(int i=0; i<size; i++){
      cidade=true;
      for(int j=0; j<size; j++){
        if(matriz[j][i] == 1 && i!=j){
          cidade = false;
        }
      }
      if(cidade){
        System.out.println("A cidade: "+i+" NAO tem Entrada");
      }else{
        System.out.println("A cidade: "+i+" tem Entrada");
      }
    }
    System.out.println();
  }

  public void roteiro(){
    int[] vet= new int[size];
    boolean caminho = true;
    System.out.println("Insira o roteiro com "+(size)+" numeros sendo todos menores que " +size+": ");
    for(int i=0; i<size; i++){
      vet[i] = input.nextInt();
    }

    for(int i=1; i<size; i++){
      if(i==vet.length-2){
        if((matriz[vet[i]][vet[i+1]]== 0)){
          caminho = false;
        }
      }
    }
    if(caminho){
      System.out.println("caminho possivel");
    }else{
      System.out.println("caminho impossivel");
    }
    System.out.println();
  }
  public int menorCaminho(int origem, int destino){
    int aux = origem;
    for(int i=0; i<size; i++){
      if(matriz[aux][i] == 1){
        System.out.print((origem + " "));
        if(i== destino && aux == destino){
          System.out.print(destino);
          System.out.println(" certo");
          return 0;
        }
      }
    }

       if(aux<destino){
        return menorCaminho(aux+1, destino);
      }
      if(aux>destino){
        return menorCaminho(aux-1, destino);
      }
      if(aux== destino){
        return menorCaminho(aux, destino);
      }
    return 0;
  }
  public static void main(String[] args) {
        // TODO codScanner in = new Scanner(System.in);
    boolean op;
    /*System.out.println("Aqui estão todas as pergutas da questão 2\nQuer executar tudo ou escolher: 1 sim, 0 nao");*/
      Desafio02PO cidades = new Desafio02PO();
      cidades.AbrirAquivo();
      cidades.LerArquivo();
      cidades.Kcidade();
      cidades.maiorNcidades();
      cidades.maodupla();
      cidades.saidaK();
      cidades.isolada();
      cidades.naoSaida();
      cidades.naoEntrada();
      cidades.roteiro();
      
  }
}

    
    


