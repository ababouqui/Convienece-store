package Classes;

import Classes.Interface.IHire;

public class Manager implements IHire {
    private String name;
    private boolean isReadyToHire;

    public Manager(String name, boolean isReadyToHire) {
        this.name = name;
        this.isReadyToHire = isReadyToHire;
    }

    public String getName() {
        return name;
    }

    public boolean isReadyToHire() {
        return isReadyToHire;
    }



    @Override
    public String canHireCashier(Applicant applicant) {
        int minimumAge = 18;
        int maximumAge = 25;

        if (applicant.getAge() >= minimumAge && applicant.getAge() <= maximumAge &&
                isReadyToHire) {
            return "We are pleased to inform you that you have been hired as a cashier " +
                    "in our store. Congratulations.";
        }else{
            return "Unfortunately, we cannot continue with your application at this time. ";
        }
    }
}
