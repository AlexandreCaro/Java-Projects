public class TestClass {
}

class BadClass {
    int method(int v1){
        // something using v1;
        int v2 = v1+3;
        // something using v2;
        int result = v2+10;
        return result;
    }
}

class GoodClass {
    int method1(int v1){
        // something using v1;
        int v2 = v1+3;
        return v2;
    }
    int method2(int v2){
        // something using v2
        int result = v2 + 10;
        return result;
    }
}
