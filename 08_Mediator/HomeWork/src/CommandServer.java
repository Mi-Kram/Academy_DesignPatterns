import java.util.ArrayList;


public class CommandServer {
  ArrayList<Unit> units;

  public CommandServer() {
    units = new ArrayList<>();
  }

  public void registerUnit(Unit unit) {
    units.add(unit);
  }

  public void unregisterUnit(Unit unit) {
    units.remove(unit);
  }


  // region move(x, y)

  public void move(int x, int y, Unit receiver){
    receiver.move(x, y);
  }

  public void move(int x, int y, Unit[] receivers){
    for (Unit receiver : receivers) receiver.move(x, y);
  }

  public void move(int x, int y, UnitType type){
    for (Unit receiver : units)
      if(receiver.type == type) 
        receiver.move(x, y);
  }

  public void moveAll(int x, int y){
    for (Unit receiver : units) receiver.move(x, y);
  }

  // endregion


  // region attack(x, y)

  public void attack(int x, int y, Unit receiver){
    receiver.attack(x, y);
  }

  public void attack(int x, int y, Unit[] receivers){
    for (Unit receiver : receivers) receiver.attack(x, y);
  }

  public void attack(int x, int y, UnitType type){
    for (Unit receiver : units)
      if(receiver.type == type) 
        receiver.attack(x, y);
  }

  public void attackAll(int x, int y){
    for (Unit receiver : units) receiver.attack(x, y);
  }

  // endregion


  // region attack(object)

  public void attack(Unit object, Unit receiver){
    receiver.attack(object);
  }

  public void attack(Unit object, Unit[] receivers){
    for (Unit receiver : receivers) receiver.attack(object);
  }

  public void attack(Unit object, UnitType type){
    for (Unit receiver : units)
      if(receiver.type == type) 
        receiver.attack(object);
  }

  public void attackAll(Unit object){
    for (Unit receiver : units) 
      if(receiver != object)
        receiver.attack(object);
  }

  // endregion


  // region attack(range)

  public void attack(int range, Unit receiver){
    receiver.attack(range);
  }

  public void attack(int range, Unit[] receivers){
    for (Unit receiver : receivers) receiver.attack(range);
  }

  public void attack(int range, UnitType type){
    for (Unit receiver : units)
      if(receiver.type == type) 
        receiver.attack(range);
  }

  public void attackAll(int range){
    for (Unit receiver : units) receiver.attack(range);
  }

  // endregion


  // region retreat(x, y)

  public void retreat(int x, int y, Unit receiver){
    receiver.retreat(x, y);
  }

  public void retreat(int x, int y, Unit[] receivers){
    for (Unit receiver : receivers) receiver.retreat(x, y);
  }

  public void retreat(int x, int y, UnitType type){
    for (Unit receiver : units)
      if(receiver.type == type) 
        receiver.retreat(x, y);
  }

  public void retreat(int x, int y){
    for (Unit receiver : units) receiver.retreat(x, y);
  }

  // endregion


  // region standby(x, y)

  public void standby(int x, int y, Unit receiver){
    receiver.standby(x, y);
  }

  public void standby(int x, int y, Unit[] receivers){
    for (Unit receiver : receivers) receiver.standby(x, y);
  }

  public void standby(int x, int y, UnitType type){
    for (Unit receiver : units)
      if(receiver.type == type) 
        receiver.standby(x, y);
  }

  public void standby(int x, int y){
    for (Unit receiver : units) receiver.standby(x, y);
  }

  // endregion






}
