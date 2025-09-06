interface Subject{
    public void addObserver(Observer observer);
    public void remmoveObserver(Observer observer);
    public void notifyObserver();
}
