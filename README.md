# StringAndInteger_Java
StringAndInteger_Java

``` java 
package com.example.stringandint;

public class CustomString {
    public static void main(String[] args) {
        String name = "Carlos Santiago";
        System.out.println(name);

        String anotherName;
        anotherName = "Santiago Cruz";
        System.out.println(anotherName);

            int integer = 23;
        System.out.println(integer);

        int anotherInt;
        anotherInt = 32;
        System.out.println(anotherInt);

        int multiplicationInt = integer * anotherInt;
        System.out.println(multiplicationInt);
    }
}
```


``` console
"/Applications/Android Studio.app/Contents/jre/jdk/Contents/Home/bin/java" "-javaagent:/Applications/Android Studio.app/Contents/lib/idea_rt.jar=50329:/Applications/Android Studio.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Users/carlossantiagocruz/Library/Android/sdk/platforms/android-29/android.jar:/Users/carlossantiagocruz/Library/Android/sdk/platforms/android-29/data/res:/Users/carlossantiagocruz/Documents/ANDROID_PROGRAMMING/Projects/StringAndInteger_Java/StringAndInt/app/build/intermediates/javac/debug/classes:/Users/carlossantiagocruz/Documents/ANDROID_PROGRAMMING/Projects/StringAndInteger_Java/StringAndInt/app/build/generated/res/resValues/debug:/Users/carlossantiagocruz/.gradle/caches/modules-2/files-2.1/androidx.collection/collection/1.0.0/42858b26cafdaa69b6149f45dfc2894007bc2c7a/collection-1.0.0.jar:/Users/carlossantiagocruz/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-common/2.0.0/e070ffae07452331bc5684734fce6831d531785c/lifecycle-common-2.0.0.jar:/Users/carlossantiagocruz/.gradle/caches/modules-2/files-2.1/androidx.arch.core/core-common/2.0.0/bb21b9a11761451b51624ac428d1f1bb5deeac38/core-common-2.0.0.jar:/Users/carlossantiagocruz/.gradle/caches/modules-2/files-2.1/androidx.annotation/annotation/1.0.0/45599f2cd5965ac05a1488fa2a5c0cdd7c499ead/annotation-1.0.0.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/f6a183f8595ca34f3d5cc99d1f8bc322/appcompat-1.0.2/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/f6a183f8595ca34f3d5cc99d1f8bc322/appcompat-1.0.2/res:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/4f37a040d795d0eef135b10b20545e3f/fragment-1.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/d382ba9b8c9ea9d7b43a9cfaea0ecdf4/vectordrawable-animated-1.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/abc680e55824c418c024460e31034ed4/legacy-support-core-ui-1.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/ba2af06f417607d7ef1ca9f201a0d139/legacy-support-core-utils-1.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/324a702de98e8e0560de88ae82ee3427/vectordrawable-1.0.1/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/331f61861c2d3a925f2252286afb1f53/loader-1.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/f3997ce16a5c00ae84a772d300d0e1e8/viewpager-1.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/04087833f388d5ffa97a080d757646c2/coordinatorlayout-1.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/04087833f388d5ffa97a080d757646c2/coordinatorlayout-1.0.0/res:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/34085af895daa23049fd0af188e6a001/drawerlayout-1.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/eb11c4797d5d5b24d5dcbbebe26babf4/slidingpanelayout-1.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/740a70a0c89c8c085b6e012b4bd7790e/customview-1.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/31dc29ba3158cee4b1ca2bf2f6ff141b/swiperefreshlayout-1.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/435f1166e6a428a0025d9cd273cb35a2/asynclayoutinflater-1.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/72b2b92ec4ab73ff21fb9bc348de3b22/core-1.0.1/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/72b2b92ec4ab73ff21fb9bc348de3b22/core-1.0.1/res:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/07608d1ce0a2b5e25216bbe877b06158/versionedparcelable-1.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/aa91d8d2653c363bbd5da9d9892260d3/cursoradapter-1.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/684c19030ab34291fff8f6b761838da8/lifecycle-runtime-2.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/9d52be8c254a228a91eaf05f51d52923/documentfile-1.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/9093771a98b01557e81860f4122d7892/localbroadcastmanager-1.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/7ec682ca46f5c90ea9a9e0cba0c0310a/print-1.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/85b59553d84ac8d04663d7d81848664c/lifecycle-viewmodel-2.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/420f294924962582b4c42c622af43461/lifecycle-livedata-2.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/66e997bde0b6ece28f7fd36f5f4a1584/lifecycle-livedata-core-2.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/8787729f29cf7add1bc29c81caccddfd/core-runtime-2.0.0/jars/classes.jar:/Users/carlossantiagocruz/.gradle/caches/transforms-2/files-2.1/d4ef17d609918d2a5f5a86d1ea02678f/interpolator-1.0.0/jars/classes.jar com.example.stringandint.CustomString
Carlos Santiago
Santiago Cruz
23
32
736

Process finished with exit code 0
```

# demo Class

``` java
package com.example.stringandint;

public class Demo {
    public static void main(String[] args) {
        Player carlosPlayer = new Player();
        System.out.println(carlosPlayer.getHandleName());
        carlosPlayer.handleName = "Carlos";
        System.out.println(carlosPlayer.getHandleName());
        carlosPlayer.lives = 20;
        carlosPlayer.level = 1;
        carlosPlayer.score = 0;

        Player triniPlayer = new Player();
        triniPlayer.handleName = "Trinidad";
        triniPlayer.setHandleName("Trinidad");
        System.out.println(triniPlayer.getHandleName());

        Enemy enemy = new Enemy("test enemy",10, 3);
        enemy.showInfo();
        enemy.takeDamage(3);
        enemy.showInfo();

        Troll uglyTroll = new Troll("Ugly Troll");
        uglyTroll.showInfo();
        uglyTroll.takeDamage(30);


    }
}
```

# Enemy Class

``` java
package com.example.stringandint;

public class Enemy {
    private String name;
    private int hitPoints;
    private int lives;

    public Enemy(String name, int hitPoints, int lives) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.lives = lives;
    }

    public void takeDamage(int damage) {
        int remainingHitPoints = this.hitPoints - damage;
        if (remainingHitPoints > 0) {
            setHitPoints(remainingHitPoints);
            System.out.println("I took " + damage + " points damage, and have " + remainingHitPoints + " left ");
        }
        else {
            this.lives = this.lives - 1;
            System.out.println("I´ve lost a life");
        }
    }

    public void showInfo() {
        System.out.println("name: " + this.name + " hitpoints " + this.hitPoints + " Lives: " + this.lives);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
```

# Player Class

``` java
package com.example.stringandint;

public class Player {
    String handleName;
    int lives;
    int level;
    int score;

    public Player() {
        handleName = "Unknown Player";
        lives = 3;
        level = 1;
        score = 0;
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handle) {
        if(handleName.length() < 3) {
            return;
        }
        handleName = handle;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
```

# Troll Class

``` java
package com.example.stringandint;

public class Troll extends Enemy {
    public Troll(String name) {
        super(name, 27,1);
    }
}
```


# Vampyre Class

``` java
package com.example.stringandint;

public class Vampyre extends Enemy {
    public Vampyre(String name) {
        super(name, 20, 30);
    }

    @Override
    public void takeDamage(int damage) {
        int damageDone = (damage/2);
        super.takeDamage(damageDone);
    }
}
```






