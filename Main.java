public class Application {

    public static void main(String[] args) {
        Course c = new Course(new Obstacle[] {
                new Cross(5),
                new Wall(3),
                new Water(7)
        });
        Team team = new Team("Команда",
                new Cat("Кот", 10, 12, 0),
                new Dog("Пёс", 20, 5, 15),
                new Cat("Котейка", 9, 14, 0),
                new Mouse("Джерри", 50, 50, 50));
        team.getTeamInfo();
        c.doIt(team);
        team.showResults();
    }
}
public class Team {
    private String name;
    private Participant participants[] = new Participant[4];
    private Participant participants[];

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Participant participantOne, Participant participantTwo, Participant participantThree, Participant participantFour) {
    public Team(String name, Participant ...participantsGiven ){
            this.name = name;
            this.participants[0] = participantOne;
            this.participants[1] = participantTwo;
            this.participants[2] = participantThree;
            this.participants[3] = participantFour;
            this.participants = participantsGiven;
        }

        public void getTeamInfo () {
            System.out.println("Команда: " + this.name);
            for (Participant participant : participants) {
                if (participant instanceof Dog) {
                    System.out.println("Собака " + participant.getName());
                }
                if (participant instanceof Cat) {
                    System.out.println("Кот " + participant.getName());
                }
                if (participant instanceof Mouse) {
                    System.out.println("Мышь " + participant.getName());
                }
            }
        }
        public void showResults () {
            for (Participant participant : participants) {
                //obstacle.doIt(participant);
                if (!participant.isOnDistance()) {
                    break;
                }
            }
        }
        public void doIt (Obstacle obstacle){
            for (Participant participant : participants) {
                obstacle.doIt(participant);
            /*if (!participant.isOnDistance()) {
                break;
            }*/
            }
        }
    }
}