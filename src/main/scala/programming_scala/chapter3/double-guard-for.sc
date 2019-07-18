val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund", "Scottish Terrier",
  "Great Dane", "Jindo")

for (breed <- dogBreeds
     if breed.contains("Terrier")
     if !breed.startsWith("Yorkshire")
) println(breed)
