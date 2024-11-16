package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseballTeam yakuruto = new BaseballTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseballTeam beisutazu = new BaseballTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseballTeam taigasu = new BaseballTeam("阪神タイガース", 68, 71, 4);
        BaseballTeam jaianntu = new BaseballTeam("読売ジャイアンツ", 68, 72, 3);
        BaseballTeam kapu = new BaseballTeam("広島東洋カープ", 66, 74,3);
        BaseballTeam doragonnzu = new BaseballTeam("中日ドラゴンズ", 66, 75, 2);
        
        yakuruto.report();
        beisutazu.report();
        taigasu.report();
        jaianntu.report();
        kapu.report();
        doragonnzu.report();
    }
    
        
    }


