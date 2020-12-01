// part one
// https://adventofcode.com/2020/day/1
// my ans: 32064 (16 x 2004)

// get input
def data = new File('day01/input01.txt').text.split("\n").collect { it as Integer }

// find two entries that add to 2020 and multiply them
def expense_2(data) {
  data.sort()
  for (entry in data) {
    difference = 2020-entry
    if (data.any { it == difference }) {
      print "${entry} x ${difference} = "
      return entry * difference
    }
  }
  return false
}

println "Part One:"
println expense_2(data)

// part two
// https://adventofcode.com/2020/day/1#part2
// my ans: 193598720

// find three entries that add to 2020
def expense_3(data) {
  data.sort()
  for (int a = 0;a<data.size;a++) {
    r_a = 2020 - data[a]

    for (int b=a;b<data.size;b++){
      r_b = r_a - data[b]

      if (data.any { it == r_b }) {
        print "${data[a]} x ${data[b]} x ${r_b} = "
        return data[a]*data[b]*r_b
      }
    }
  }
  return false
}

println "Part Two:"
println expense_3(data)
