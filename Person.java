class Person {
private float weight;
public void setWeight(float w) {
this.weight = w;
}
public float getWeight(){
return weight;
}

Person me = new Person();
me.setWeight((float) 60.0);
System.out.println(me.getWeight());

class Person {
private float weight;
public void setWeight(float w) {
this.weight = w;
}
private float getWeight(){
return weight;
}

Person me = new Person();
me.setWeight((float) 60.0);
System.out.println(me.getWeight());