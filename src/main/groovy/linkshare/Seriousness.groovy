package linkshare

enum Seriousness{
    SERIOUS("Serious"),
    VERY_SERIOUS("Very Serious"),
    CASUAL("Casual")

    private final String interest

    Seriousness(String value){
        this.interest = value
    }

    String getInterest(){
        return interest
    }
}