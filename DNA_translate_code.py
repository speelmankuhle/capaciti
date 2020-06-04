import importlib

moduleName = input('DNA_sequence_original.txt')
importlib.import_module(moduleName)

inputfile = "DNA_sequence_original.txt"
f = open(inputfile,"r")
dna = f.read()

dna = dna.replace("\n","")
dna = dna.replace("\r","")

def translate(dna):

    aminoAcids = {
        'ATA':'I', 'ATC':'I', 'ATT':'I', 'CTT':'L',
        'CTC' : 'L', 'CTA' : 'L', 'CTG' : 'L', 'TTA' : 'L',
        'CTG' : 'L', 'GTT' : 'V', 'GTC' : 'V', 'GTA' : 'V', 'GTG' : 'V',
        'TTT' : 'F', 'TTC' : 'F', 'ATG' : 'M'


    }
    protein=""
    if len(dna)%3==0:
        for i in range(0,len(dna),3):
            codon=dna[i:i+3]
            protein+=aminoAcids[codon]
    return protein

def mutate(inputfile):
	with open(inputfile, "r") as f:
		dna = f.read()
	dna = dna.replace("\n", "")
	dna = dna.replace("\r", "")
	return dna
prt = mutate("normalDNA.txt")
dna = mutate("mutatedDNA.txt")
p = translate(dna[20:935])
p == prt


def txtTranslate(inputfile):
    translateNormal = translate("normalDNA.txt", )
    translateNormal = open("normalDNA.txt", "r")
    if translateNormal.mode == "r":
        contents = translateNormal.read()
        print(contents)

    translateMutated = translate("mutatedDNA.txt", )
    translateMutated = open("mutatedDNA.txt", "r")
    if translateMutated.mode == "r":
        contents2 = translateMutated.read()
        print(contents2)
