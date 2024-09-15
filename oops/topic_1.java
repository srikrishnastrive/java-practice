
class Test {
    int age;
    public void assignAge(int num){
        age = num;
    }
}

class topic_1{

    private static void print(){
        System.out.println("print called");
    }
    public static void main(String[] args){
        print();
        Test test1 = new Test();
        test1.assignAge(10);

        Test test2 = new Test();
        test2.assignAge(5);

        System.out.println(test1.age);
        System.out.println(test2.age);
    }
}
