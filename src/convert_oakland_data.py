import json

def main():
    """converts & reformats the specific oakland data files into
    one single file 'oakland_data.json' """

#convert voting data to necessary format
with open('oakland_fixed.json') as data_file:
    data = json.load(data_file)
votes = []
vote_dict={}

for line in data:
    #convert each ranked list of id integers to strings
    for index in range(len(line)):
        line[index]=str(line[index])
    choices = {}
    choices["choices"]=line
    votes.append(choices)
vote_dict["votes"]=votes
data_file.close

#open candidates file to append to voting data
with open('oakland_candidates.json') as data_file2:
    data2 = json.load(data_file2)
vote_dict["candidates"]= data2["cands"]

#dict dumped to oakland_data.json
with open('oakland_data.json', 'w') as fp:
    json.dump(vote_dict, fp)

if __name__ == "__main__":
    main()