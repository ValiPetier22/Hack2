import java.util.*;
import java.util.stream.Collectors;

public class StreamCollectorsExercise {

    private List<Player> players=new ArrayList<>();

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public StreamCollectorsExercise() {
        players.add(new Player("Tavi Popescu",279,11000,30, new Country(2,"Romania")));
        players.add(new Player("Florinel Coman",5,278,22,new Country(1,"Pakistan")));
        players.add(new Player("Mirel Radoi",10,258,56,new Country(4,"Poland")));
    }

    //getPlayersByCountry
    //Return a map with key as country name and value as List of players

    public Map<String,List<Player>> getPlayersByCountry(){
        return players
                .stream()
                .collect(Collectors.groupingBy(player -> player.getCountry().getCountryName(),
                        Collectors.mapping(player -> player, Collectors.toList())));

    }

    //getPlayerNamesByCountry
    //Return a map with key as country name and value as List of player Names who have played more than 100 matches

    public Map<String,List<String>> getPlayerNamesByCountry(){
        return players
                .stream()
                .filter(player -> player.getMatchesPlayed()>100)
                .collect(Collectors.groupingBy(player -> player.getCountry().getCountryName(),
                        Collectors.mapping(player -> player.getPlayerName(),Collectors.toList())));
    }

    //Return a LinkedHashMap with key as country name and value as number of players in each country
    //getTotalRunsByCountry

    public LinkedHashMap<String, Long> getTotalPlayersByCountry() {
        Map<String, Long> map = players
                .stream()
                .collect(Collectors.groupingBy(player -> player.getCountry().getCountryName(), Collectors.counting()));
        return new LinkedHashMap<>(map);
    }

//    getTotalRunsByCountry
//    Return a map with key as country name and value as sum total runs of all players
public Map<String,Integer> getTotalRunsByCountry() {
        return players
                .stream()
                .collect(Collectors.groupingBy(player -> player.getCountry().getCountryName(),
                        Collectors.summingInt(Player::getRuns)));

}




}
