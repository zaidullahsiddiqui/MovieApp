package com.example.movieapp.models

data class Movie(val id: String,
                 val title: String,
                 val year: String,
                 val genre: String,
                 val director: String,
                 val actors: String,
                 val plot: String,
                 val poster: String,
                 val images: List<String>,
                 val rating: String)

fun getMovies() : List<Movie> {
    return listOf(
        Movie(
            id = "tt0499549",
            title = "Black Clover",
            year = "2017–2021",
            genre = "Animation, Action, Adventure",
            director = "Tatsuya Yoshihara",
            actors = "Gakuto Kajiwara, Nobunaga Shimazaki, Kana Yuuki",
            plot = "Asta gets a mysterious five-leaf grimoire with Anti-Magic and joins the Black Bulls, where he fights powerful enemies and uncovers the secrets of his world.",
            poster = "https://m.media-amazon.com/images/M/MV5BNTAzYTlkMWEtJTIyOS00OTU1LWI4MGYtMWZjMjU2Y2ViMGY3XkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg",
            images = listOf(
                "https://images.justwatch.com/background/176311651/s1920/black-clover.webp"
            ),
            rating = "8.3"
        ),
        Movie(
            id = "tt0944947",
            title = "Game of Thrones",
            year = "2011–2019",
            genre = "Action, Adventure, Drama",
            director = "David Benioff, D.B. Weiss",
            actors = "Emilia Clarke, Kit Harington, Peter Dinklage",
            plot = "Nine noble families fight for control over the lands of Westeros, while an ancient enemy returns after being dormant for millennia.",
            poster = "https://m.media-amazon.com/images/M/MV5BMjE4NzExODExNV5BMl5BanBnXkFtZTgwMzIyODQwNTE@._V1_FMjpg_UX1000_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BMTYwOTEzMDMzMl5BMl5BanBnXkFtZTgwNzMyODQwNTE@._V1_SX1777_CR0,0,1777,999_AL_.jpg"
            ),
            rating = "9.2"
        ),
        Movie(
            id = "tt0241646",
            title = "Harry Potter",
            year = "2001",
            genre = "Adventure, Family, Fantasy",
            director = "Chris Columbus",
            actors = "Daniel Radcliffe, Rupert Grint, Emma Watson",
            plot = "An orphaned boy enrolls in a school of wizardry, where he learns the truth about himself, his family and the terrible evil that haunts the magical world.",
            poster = "https://m.media-amazon.com/images/M/MV5BNmQ0ODBhMjUtNDVkZi00YWQ1LTlkYTUtYWMyM2EwZDAyM2FiXkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BMTMzMzY5NDA2M15BMl5BanBnXkFtZTcwMDU5MTQzMw@@._V1_SX1777_CR0,0,1777,999_AL_.jpg"
            ),
            rating = "7.6"
        ),
        Movie(
            id = "tt2560140",
            title = "Attack On Titan",
            year = "2013–2023",
            genre = "Animation, Action, Adventure",
            director = "Tetsurō Araki",
            actors = "Yuki Kaji, Yui Ishikawa, Marina Inoue",
            plot = "After his hometown is destroyed and his mother is killed, young Eren Jaeger vows to cleanse the earth of the giant humanoid Titans that have brought humanity to the brink of extinction.",
            poster = "https://m.media-amazon.com/images/M/MV5BNDYxNjQyMjAtNTdiOS00NGYwLWFmNTAtNThmYjU5ZGI2Yjk1XkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BMjA3NjYzMDgyNF5BMl5BanBnXkFtZTgwMjY4NTI2MTE@._V1_SX1777_CR0,0,1777,999_AL_.jpg"
            ),
            rating = "9.1"
        ),
        Movie(
            id = "tt0388629",
            title = "One Piece",
            year = "1999–",
            genre = "Animation, Action, Adventure",
            director = "Eiichiro Oda",
            actors = "Mayumi Tanaka, Tony Beck, Laurent Vernin",
            plot = "Monkey D. Luffy and his pirate crew explore a fantastical world of endless oceans and exotic islands in search of the world's ultimate treasure known as One Piece.",
            poster = "https://m.media-amazon.com/images/M/MV5BMTNjNGU4NTUtYWYzMy00MjdiLTg2M2UtMWYwYTc3MTMxZGJhXkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BMTY0Nzg3MDYyOV5BMl5BanBnXkFtZTgwNTM0MTI2MTE@._V1_SX1777_CR0,0,1777,999_AL_.jpg"
            ),
            rating = "9.0"
        ),
        Movie(
            id = "tt8451842",
            title = "Baki",
            year = "2018–2020",
            genre = "Animation, Action, Drama",
            director = "Toshiki Hirano",
            actors = "Nobunaga Shimazaki, Kirk Thornton, Troy Baker",
            plot = "The protagonist, Baki Hanma, trains with an intense focus to become strong enough to surpass his father, Yujiro Hanma, the strongest fighter in the world.",
            poster = "https://m.media-amazon.com/images/M/MV5BOTU5YjYwZTMtOTA1Mi00MzY1LTg4N2EtMTY3MzY1MThhM2EyXkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BMTY3NjE5NDM1MV5BMl5BanBnXkFtZTgwMzU2MTI2MTE@._V1_SX1777_CR0,0,1777,999_AL_.jpg"
            ),
            rating = "6.7"
        ),
        Movie(
            id = "tt0468569",
            title = "Batman",
            year = "2008",
            genre = "Action, Crime, Drama",
            director = "Christopher Nolan",
            actors = "Christian Bale, Heath Ledger, Aaron Eckhart",
            plot = "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.",
            poster = "https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTgwODAyMTk2NjE@._V1_FMjpg_UX1000_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BMTkxMzA4MDkwN15BMl5BanBnXkFtZTcwODcyODQwMg@@._V1_SX1777_CR0,0,1777,999_AL_.jpg"
            ),
            rating = "9.0"
        ),
        Movie(
            id = "tt0770828",
            title = "Superman",
            year = "2013",
            genre = "Action, Adventure, Sci-Fi",
            director = "Zack Snyder",
            actors = "Henry Cavill, Amy Adams, Michael Shannon",
            plot = "An alien child is evacuated from his dying world and sent to Earth to live among humans. New crises force him to turn into the hero Superman.",
            poster = "https://m.media-amazon.com/images/M/MV5BMTk5ODk1NDkxMF5BMl5BanBnXkFtZTcwNTA5OTY0OQ@@._V1_FMjpg_UX1000_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BMTM0NjQ4OTgyNV5BMl5BanBnXkFtZTgwNTA0MTI2MTE@._V1_SX1777_CR0,0,1777,999_AL_.jpg"
            ),
            rating = "7.1"
        )
    )
}