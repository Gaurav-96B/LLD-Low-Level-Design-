public class ConcreteMediator implements Mediator {
  private List<Colleague> colleagues;
	
	public ConcreteMediator(){
		this.colleagues=new ArrayList<>();
	}

	@Override
	public void addUser(Colleague colleague){
		this.colleagues.add(colleague);
	}

  @Override
	public void sendMessage(String message, Colleague colleague) {
		for(Colleague c : this.colleagues){
			//message should not be received by the user sending it
			if(c!= colleague){
				c.receive(message);
			}
		}
	}
}
