package quest;


public class Enemy {

    private enum enemy_type{
        watermelon, pineapple
    }

    String EnemyCurrent;

    private int ripeness;
    private int sweetness;
    private int tartness;
    private int bruiseResist;
    private int shelfLife;


    private void enemyType(String enemy){

        switch(enemy) {

            case "watermelon":
                ripeness = 2;
                sweetness = 1;
                tartness = 1;
                bruiseResist = 3;
                shelfLife = 6;
                break;

            case "pineapple":
                ripeness = 3;
                sweetness = 3;
                tartness = 1;
                bruiseResist = 2;
                shelfLife = 8;
                break;
        }
    }

        public String getEnemyCurrent() {
            return EnemyCurrent;
        }

        public void setEnemyCurrent(String enemyCurrent) {
            EnemyCurrent = enemyCurrent;
        }

        public int getRipeness() {
            return ripeness;
        }

        public void setRipeness(int ripeness) {
            this.ripeness = ripeness;
        }

        public int getSweetness() {
            return sweetness;
        }

        public void setSweetness(int sweetness) {
            this.sweetness = sweetness;
        }

        public int getTartness() {
            return tartness;
        }

        public void setTartness(int tartness) {
            this.tartness = tartness;
        }

        public int getBruiseResist() {
            return bruiseResist;
        }

        public void setBruiseResist(int bruiseResist) {
            this.bruiseResist = bruiseResist;
        }

        public int getShelfLife() {
            return shelfLife;
        }

        public void setShelfLife(int shelfLife) {
            this.shelfLife = shelfLife;
        }

}
