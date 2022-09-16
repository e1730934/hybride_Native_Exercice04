import com.applicationhybride.exercice04.models.Habitat
import com.applicationhybride.exercice04.models.Poketype
import com.applicationhybride.exercice04.models.Specie


data class Pokemon (

    var pokemonId : Int?                 = null,
    var name      : String?              = null,
    var color     : String?              = null,
    var thumbURL  : String?              = null,
    var imgURL    : String?              = null,
    var cryURL    : String?              = null,
    var habitat   : Habitat?             = Habitat(),
    var species   : Specie?             = Specie(),
    var poketypes : ArrayList<Poketype> = arrayListOf(),
)
