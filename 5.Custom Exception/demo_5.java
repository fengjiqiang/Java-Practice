class NoThisSoundException extends Exception{
    public NoThisSoundException(){
        super();
    }
    public NoThisSoundException(String x){
        super(x);
    }
}

class Player{
    public void player(int index) throws NoThisSoundException{
        if (index>10){
            NoThisSoundException no = new NoThisSoundException("您播放的歌曲不存在");
            throw no;
        }else{
            System.out.println("正常播放");
        }
    }
}

public class demo_5 {

    public static void main(String[] args){

        Player pl = new Player();
        try{
            pl.player(1);
            pl.player(21);
        }catch (NoThisSoundException no){
            System.out.println(no.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {

        }
    }
}

