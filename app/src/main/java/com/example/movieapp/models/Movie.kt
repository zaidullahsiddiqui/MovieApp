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
               "https://media.themoviedb.org/t/p/w440_and_h660_face/kaMisKeOoTBPxPkbC3OW7Wgt6ON.jpg",
               "https://image.tmdb.org/t/p/original/3b3OfoVGsFSLjp0qcyrFntVLYFo.jpg",
                "https://image.tmdb.org/t/p/original/ixM7N62bjtu5PGr1Tq3wuBbELxX.jpg"

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
            poster = "https://image.tmdb.org/t/p/original/fw9hNiJO0U5MUg2XGyCOlTS3jdS.jpg",
            images = listOf(
                "https://image.tmdb.org/t/p/original/6Y8G6vpnVK5fEVOVZX76BhhNWSL.jpg",
                "https://image.tmdb.org/t/p/original/2AmrHvmq0kzNpYeXFSgX5QT4nDi.jpg",
                "https://image.tmdb.org/t/p/original/gKepMfnseLPwbZ0U9E1LmMW2x4V.jpg"
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
            poster = "https://media.themoviedb.org/t/p/w440_and_h660_face/SJCnXVBJZh7X7ePLt6XMp6TZAj.jpg",
            images = listOf(
                "https://media.themoviedb.org/t/p/w440_and_h660_face/nQmu81v0DD7dXTQgFn6d5S9PsoD.jpg",
                "https://image.tmdb.org/t/p/original/nQmu81v0DD7dXTQgFn6d5S9PsoD.jpg",
                "https://image.tmdb.org/t/p/original/wDWXXc5QclXWzDxgY5LOtyN7jJs.jpg"
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
            poster = "https://media.themoviedb.org/t/p/w440_and_h660_face/wgwldDDlTDDMrluOMkpSA8lyKjv.jpg",
            images = listOf(
                "https://image.tmdb.org/t/p/original/fM2vFlNFUTnEuskcVoN9hd0IvED.jpg",
                "https://image.tmdb.org/t/p/original/hTP1DtLGFamjfu8WqjnuQdP1n4i.jpg",
                "https://image.tmdb.org/t/p/original/sHim6U0ANsbzxcmNRYuIubBVQaz.jpg"
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
            poster = "https://image.tmdb.org/t/p/original/dB4EDhre2dsC2kxYDavyKWqLQwi.jpg",
            images = listOf(
                "https://image.tmdb.org/t/p/original/gJI77i79KnRuc9mGPKADPZWAE8O.jpg",
                "https://image.tmdb.org/t/p/original/dB4EDhre2dsC2kxYDavyKWqLQwi.jpg",
                "https://image.tmdb.org/t/p/original/cMD9Ygz11zjJzAovURpO75Qg7rT.jpg"
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
            poster = "https://media.themoviedb.org/t/p/w440_and_h660_face/j4bL0G8h8k49MuXKYfZqhXqk2rI.jpg",
            images = listOf(
                "https://media.themoviedb.org/t/p/w440_and_h660_face/p0Jz2IQ12YqKwHwzD00KpXjidn8.jpg",
                "https://image.tmdb.org/t/p/original/j4bL0G8h8k49MuXKYfZqhXqk2rI.jpg",
                "https://image.tmdb.org/t/p/original/c79L7zCnRzDJerrlbIWkNCjA6tg.jpg"
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
            poster = "https://media.themoviedb.org/t/p/w440_and_h660_face/seyWFgGInaLqW7nOZvu0ZC95rtx.jpg",
            images = listOf(
                "https://media.themoviedb.org/t/p/w440_and_h660_face/8gVy5MLXtZBWghMykQtPMsNc5kH.jpg",
                "https://image.tmdb.org/t/p/original/74xTEgt7R36Fpooo50r9T25onhq.jpg",
                "https://image.tmdb.org/t/p/original/seyWFgGInaLqW7nOZvu0ZC95rtx.jpg"
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
            poster = "https://media.themoviedb.org/t/p/w440_and_h660_face/wPLysNDLffQLOVebZQCbXJEv6E6.jpg",
            images = listOf(
                "https://image.tmdb.org/t/p/original/cB8LvZHGSOmFrz9FKGS4LpdC26g.jpg",
                "https://media.themoviedb.org/t/p/w440_and_h660_face/wPLysNDLffQLOVebZQCbXJEv6E6.jpg",
                "https://image.tmdb.org/t/p/original/oy31ICfYODQzQ5V8uiA8I4apGt9.jpg"
            ),
            rating = "7.1"
        )
    )
}