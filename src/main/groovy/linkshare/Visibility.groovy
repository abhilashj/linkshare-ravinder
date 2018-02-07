package linkshare

enum Visibility{
    PUBLIC("Public","People"),
    PRIVATE("Private","Personal")

    private final String first
    private final String second

    Visibility(String val1){
        this.first = val1
    }

    Visibility(String val1,String val2){
        this.first = val1
        this.second = val2
    }

    String getFirst(){
        return first
    }

    String getSecond(){
        return second
    }
}