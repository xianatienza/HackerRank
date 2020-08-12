package hackerrank;

public class PracticeWaitNotify {

    public static void main(String[] args) {

        PracticeWaitNotify switcher = new PracticeWaitNotify();

        Thread offSwitcher = new Thread() {
            @Override
            public void run() {
                synchronized (switcher) {
                    while(true) {
                        if(!switcher.isOn()) {
                            try {
                                switcher.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        switcher.switchTo("Offer", false);

                       switcher.notifyAll();
                    }
                }
            }
        };

        Thread onSwitcher = new Thread() {
            @Override
            public void run() {
                synchronized (switcher) {
                    while(true) {
                        if(switcher.isOn()) {
                            try {
                                switcher.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        switcher.switchTo("Oner", true);
                       switcher.notifyAll();
                    }
                }

            }
        };

//        Thread onSwitcher2 = new Thread() {
//            @Override
//            public void run() {
//                synchronized (switcher) {
//                    while(true) {
//                        if(switcher.isOn()) {
//                            try {
//                                switcher.wait();
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                        switcher.switchTo("Oner2", true);
//                        switcher.notifyAll();
//                    }
//                }
//
//            }
//        };

        onSwitcher.start();
        //onSwitcher2.start();
        offSwitcher.start();

    }

    private boolean lightSwitch;

    private boolean isOn() {
        return lightSwitch;
    }

    private void switchTo(String name, boolean toOn) {
        sleep();
        if(isOn()!=toOn) {
            System.out.println(name+" switched "+(toOn?"on":"off")+" the light");
            lightSwitch = toOn;
        }
    }

    private void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
