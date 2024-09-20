package jogodavelha;

public class JogarOJogo {
    //variaveis de instancia
    private int jv[][] = new int[3][3];
    private int jdv;
    private int quemGanhou;
    //construtor
    public void JogarOJogo(){
    this.jdv = 1;
    this.quemGanhou = 0;
    //linha O
    this.jv[0][0] = 0;
    this.jv[0][1] = 0;
    this.jv[0][2] = 0;
    //linha 1
    this.jv[0][1] = 0;
    this.jv[1][1] = 0;
    this.jv[1][2] = 0;
    //linha 2
    this.jv[2][0] = 0;
    this.jv[2][1] = 0;
    this.jv[2][2] = 0;
    }
    //sets e gets - variaveis de negocio
    //linha 1
    public void setJV_00 (int jv_00){
       this.jv[0][0] = jv_00;
    }
    public int getJV_00(){
       return this.jv[0][0];    
    }
    public void setJV_01 (int jv_01){
       this.jv[0][1] = jv_01;
    }
    public int getJV_01(){
       return this.jv[0][1];    
    }
    public void setJV_02 (int jv_02){
       this.jv[0][2] = jv_02;
    }
    public int getJV_02(){
       return this.jv[0][2];    
    }
    //linha 1 
    public void setJV_10 (int jv_10){
       this.jv[0][1] = jv_10;
    }
    public int getJV_10(){
       return this.jv[0][1];    
    }
    public void setJV_11 (int jv_11){
       this.jv[1][1] = jv_11;
    }
    public int getJV_11(){
       return this.jv[1][1];    
    }
    public void setJV_12 (int jv_12){
       this.jv[1][2] = jv_12;
    }
    public int getJV_12(){
       return this.jv[1][2];    
    }
    //linha 2
    public void setJV_20 (int jv_20){
       this.jv[2][0] = jv_20;
    }
    public int getJV_20(){
       return this.jv[2][0];    
    }
    public void setJV_21 (int jv_21){
       this.jv[2][1] = jv_21;
    }
    public int getJV_21(){
       return this.jv[2][1];    
    }
     public void setJV_22 (int jv_22){
       this.jv[2][2] = jv_22;
    }
    public int getJV_22(){
       return this.jv[2][2];    
    }
    //JDV
    public void SetJogadorDaVez (int jdv){
        this.jdv = jdv;}
    public int getJogadorDaVez (){
        return this.jdv ;}
    //Vencedor
    public int getQuemGanhou(){
        return this.quemGanhou;
    }
    
    public void JogadorDaVez(){
        if (this.jdv == 1){
            this.jdv = 2;
    } else {     
       this.jdv = 1;
        }
    }
    
    //verificar quem venceu
    public void verificarVencedor(){
        this.quemGanhou = 0;
    //verificar se X/1 ganhou 
    //horizontal
    if ((getJV_00() == 1) && (getJV_01() == 1) && (getJV_02() == 1)){ this.quemGanhou = 1;}
    if ((getJV_10() == 1) && (getJV_11() == 1) && (getJV_12() == 1)){ this.quemGanhou = 1;}
    if ((getJV_20() == 1) && (getJV_21() == 1) && (getJV_22() == 1)){ this.quemGanhou = 1;}
    //vertical
    if ((getJV_00() == 1) && (getJV_10() == 1) && (getJV_20() == 1)){ this.quemGanhou = 1;}
    if ((getJV_01() == 1) && (getJV_11() == 1) && (getJV_21() == 1)){ this.quemGanhou = 1;}
    if ((getJV_02() == 1) && (getJV_12() == 1) && (getJV_22() == 1)){ this.quemGanhou = 1;}
    //diagonal
    if ((getJV_00() == 1) && (getJV_11() == 1) && (getJV_22() == 1)){ this.quemGanhou = 1;}
    if ((getJV_20() == 1) && (getJV_11() == 1) && (getJV_02() == 1)){ this.quemGanhou = 1;}
    //verificar se O/2
    if ((getJV_00() == 1) && (getJV_01() == 1) && (getJV_02() == 1)){ this.quemGanhou = 1;}
    if ((getJV_10() == 1) && (getJV_11() == 1) && (getJV_12() == 1)){ this.quemGanhou = 1;}
    if ((getJV_20() == 1) && (getJV_21() == 1) && (getJV_22() == 1)){ this.quemGanhou = 1;}
    //vertical
    if ((getJV_00() == 1) && (getJV_10() == 1) && (getJV_20() == 1)){ this.quemGanhou = 1;}
    if ((getJV_01() == 1) && (getJV_11() == 1) && (getJV_21() == 1)){ this.quemGanhou = 1;}
    if ((getJV_02() == 1) && (getJV_12() == 1) && (getJV_22() == 1)){ this.quemGanhou = 1;}
    //diagonal
    if ((getJV_00() == 1) && (getJV_11() == 1) && (getJV_22() == 1)){ this.quemGanhou = 1;}
    if ((getJV_20() == 1) && (getJV_11() == 1) && (getJV_02() == 1)){ this.quemGanhou = 1;}
    }


    }
    
    
    

