package pl.dreem.fascade;

class ServicesFacade {

    public void aggregateFunctionality(){
        new FirstService().firstMethod();
        new SecondService().secondMethod();
        new ThirdService().thirdMethod();
    }

}
