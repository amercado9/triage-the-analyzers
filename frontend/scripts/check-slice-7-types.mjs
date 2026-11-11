import { spawnSync } from 'node:child_process'
import { fileURLToPath } from 'node:url'

const vueTsc = fileURLToPath(new URL('../node_modules/vue-tsc/bin/vue-tsc.js', import.meta.url))
const result = spawnSync(process.execPath, [vueTsc, '--build', '--force', '--pretty', 'false'], {
  cwd: fileURLToPath(new URL('..', import.meta.url)),
  encoding: 'utf8'
})

if (result.error) {
  throw result.error
}

const output = `${result.stdout ?? ''}${result.stderr ?? ''}`
const sliceErrorPattern =
  /^src\/components\/(SearchPeriod|SearchWeek|TopNavigationBar)\.vue.*error TS/m
const sliceErrors = output.split(/\r?\n/).filter((line) => sliceErrorPattern.test(line))

if (sliceErrors.length > 0) {
  console.error(`Slice 7 still has ${sliceErrors.length} vue-tsc error(s):`)
  console.error(sliceErrors.join('\n'))
  process.exit(1)
}

console.log('Slice 7 has no vue-tsc errors.')
