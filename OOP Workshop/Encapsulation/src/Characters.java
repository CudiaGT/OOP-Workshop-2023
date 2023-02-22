public class Characters {
    private String name;
    private int level;
    private String skill1;
    private String skill2;

    Characters (String n, int l, String s1, String s2) {
        name = n;
        level = l;
        skill1 = s1;
        skill2 = s2;
    }

    //Through these methods, the user can access the values that are stored in each field of the object.
    public String getName() {return name;}
    public int getLevel() {return level;}
    public String getSkill1() {return skill1;}
    public String getSkill2() {return skill2;}

    //However, we will only allow the user to modify the "name" field of the objects.
    public void setName(String newName) {name = newName;}
}
