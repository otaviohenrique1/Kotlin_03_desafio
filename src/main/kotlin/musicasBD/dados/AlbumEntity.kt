package musicasBD.dados

import jakarta.persistence.*

@Entity
@Table(name = "albuns")
class AlbumEntity(
    val titulo: String = "Título do álbum",
    @ManyToOne
    val banda: BandaEntity = BandaEntity(),
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0
) {
}