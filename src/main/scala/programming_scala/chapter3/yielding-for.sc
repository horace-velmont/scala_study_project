val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund", "Scottish Terrier",
  "Great Dane", "Jindo")

val filterBreeds = for {
  breed <- dogBreeds
  if breed.contains("Terrier") && !breed.startsWith("Yorkshire")
} yield breed
